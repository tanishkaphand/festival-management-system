const form = document.getElementById('festivalForm');
const list = document.getElementById('festivalList');

form.addEventListener('submit', async (e) => {
    e.preventDefault();
    const festival = {
        name: document.getElementById('name').value,
        location: document.getElementById('location').value,
        date: document.getElementById('date').value
    };

    await fetch('http://localhost:8082/api/festivals', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(festival)
    });

    loadFestivals();
    form.reset();
});

async function loadFestivals() {
    const res = await fetch('http://localhost:8082/api/festivals');
    const festivals = await res.json();
    list.innerHTML = '';
    festivals.forEach(f => {
        const li = document.createElement('li');
        li.textContent = `${f.name} - ${f.location} (${f.date})`;
        list.appendChild(li);
    });
}

loadFestivals();
