# festival-management-system
A Spring Boot-based Festival Management System made with eclipse and maven project also it has rest API

# 🎉 Festival Management System

A responsive and secure **Festival Management System** built using **Spring Boot**, **PostgreSQL**, **HTML/CSS/JavaScript**, and follows the **MVC architecture**. It allows administrators to **add, edit, view, and delete** festival entries with features like **dark mode**, **category filter**, **image uploads**, **map integration**, and more.

---

## 🚀 Features

- ✅ Add / Edit / Delete Festival entries
- ✅ Search and filter by festival name and location
- ✅ Festival category support (Cultural, Religious, International, etc.)
- ✅ Upload festival images and display thumbnails
- ✅ Dark/Light Mode toggle
- ✅ Pagination and sorting
- ✅ Map integration using Google Maps
- ✅ Calendar view (via FullCalendar.js)
- ✅ Responsive UI using HTML, CSS, JS
- ✅ REST API with Spring Boot and PostgreSQL

---

## 🧑‍💻 Tech Stack

| Technology     | Description                          |
|----------------|--------------------------------------|
| Java 17        | Programming Language                 |
| Spring Boot    | Backend Framework                    |
| PostgreSQL     | Database                             |
| HTML/CSS/JS    | Frontend                             |
| JPA + Hibernate| ORM for data access                  |
| REST API       | Data communication                   |
| Maven          | Project Dependency Management        |

---

## 📸 UI Highlights

- 🌗 Toggle between dark/light themes  
- 🖼️ Festival image upload & display  
- 🧭 Google Map for festival location  
- 📅 FullCalendar.js for calendar view  
- 🔍 Search bar with live filtering  
- 🧮 Pagination and sorting

---

## 📂 Project Structure

```
festival-management-system/
├── backend/
│   ├── src/main/java/com/fms/
│   │   ├── controller/
│   │   ├── model/
│   │   ├── repository/
│   │   └── service/
│   ├── resources/
│   │   ├── application.properties
├── frontend/
│   ├── index.html
│   ├── style.css
│   └── script.js
├── README.md
└── pom.xml
```

---

## 🛠️ Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/festival-management-system.git
   cd festival-management-system
   ```

2. **Backend Setup (Spring Boot)**
   - Make sure PostgreSQL is running and update:
     ```
     src/main/resources/application.properties
     ```
   - Run the project:
     ```
     ./mvnw spring-boot:run
     ```

3. **Frontend Setup**
   - Simply open `index.html` in your browser or serve via any local server

---

## 🔐 Admin Panel (Coming Soon)


- Session-based authorization
- Admin-only controls for CRUD operations

---

## 👩‍💻 Creator

**Tanishka Natraj Phand**  
📧 tanishka14@gmail.com  

---

## 🏷️ License

This project is open-source and available under the [MIT License](LICENSE).

---

## 📬 Contact

For queries or collaboration, feel free to contact the creator at the above email.
