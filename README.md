📚 Textbook Library Management System 🎉
<p align="center"> <img src="https://i.ibb.co/4S3TVpH/library-banner.jpg" alt="Library Banner" width="800"/> </p> <p align="center"> <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=24&pause=1000&color=FF4B4B&center=true&vCenter=true&width=700&height=80&lines=Chào+mừng+đến+với+Ứng+Dụng+Quản+Lý+Thư+Viện+Giáo+Trình;Nhóm+08+OOP_N02_T3_2_2025_" alt="Typing SVG" /> </p> <p align="center"> <a href="https://github.com/phamkheng/OOP_N02_T3_2_2025_Group1"> <img src="https://raw.githubusercontent.com/acervenky/animated-github-badges/master/assets/devbadge.gif" width="50" alt="Developer Badge" /> <img src="https://raw.githubusercontent.com/acervenky/animated-github-badges/master/assets/contribbadge.gif" width="50" alt="Contributor Badge" /> <img src="https://img.shields.io/badge/Java-Spring%20Boot-orange?logo=java&logoColor=white" alt="Java Badge"/> <img src="https://img.shields.io/github/license/phamkheng/OOP_N02_T3_2_2025_Group1?style=flat-square" alt="License Badge"/> </a> </p>

📋 Mục lục

📖 Giới thiệu

👥 Thành viên

🧠 Phân tích đối tượng

📂 Cấu trúc thư mục

🏗️ Cấu trúc lớp và phân lớp

🧪 Kiểm thử chức năng

🛠️ Các chức năng chính

📊 Class Diagram

📝 Mô tả đối tượng

🖥️ Giao diện chương trình

🌟 Chức năng nổi bật

💡 Công nghệ sử dụng

🚀 Hướng phát triển

⚙️ Cài đặt--Chạy

📚 Tài liệu tham khảo

📖 Giới thiệu

Ứng dụng Quản lý Thư viện giáo trình được xây dựng theo phong cách Lập trình Hướng đối tượng (OOP), giúp bạn:

Quản lý giáo trình (Book)

Quản lý bạn đọc (Reader)

Theo dõi lịch sử mượn/trả (Loan)

👥 Thành viên

Họ tên	MSSV	GitHub
Phạm Năng Khang	24100032	@phamkheng
Trần Quốc Việt Hùng	24100015	@hungspec
Phạm Việt Khoa	24100058	@pvkhoa
Nguyễn Lệ Thu		@nglthu
🧠 Phân tích đối tượng

1. 👤 Người đọc (Reader)

Thuộc tính: ID, tên, số điện thoại, email.

Chức năng:

Đăng ký người đọc

Hiển thị thông tin

Xóa người đọc khỏi danh sách

Thêm người đọc mới

Chỉnh sửa thông tin

Tìm kiếm người đọc

2. 🧾 Giáo trình (Book)

Thuộc tính: ID, tên, tác giả, trạng thái (có sẵn / trống), số lượng.

Chức năng:

Cập nhật giáo trình mới

Hiển thị danh sách giáo trình

Tìm kiếm giáo trình

Xóa giáo trình khỏi danh sách

Cập nhật số lượng

Quản lý sách có sẵn hoặc đang mượn

3. 📦 Dịch vụ mượn/trả (Loan)

Thuộc tính: ID, book, reader, ngày mượn, ngày trả, trạng thái

Chức năng:

Mượn sách

Quản lý phiếu mượn

Trả sách

Tìm kiếm phiếu mượn

📂 Cấu trúc thư mục

Project/
├── QuanliGiaoTrinh_springboot/       # Spring Boot
│   ├── complete/
│   │   ├── gradle/wrapper
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/com/example/servingwebcontent/
│   │   │   │   │   ├── Component
│   │   │   │   │   ├── Controller
│   │   │   │   │   ├── Database
│   │   │   │   │   ├── Model
│   │   │   │   │   │   ├── Book.java
│   │   │   │   │   │   ├── Reader.java
│   │   │   │   │   │   ├── Loan.java
│   │   │   │   │   ├── test
│   │   │   │   │   ├── ServingWebContentApplication.java
│   │   │   ├── resources/
│   │   │   │   ├── static/
│   │   │   │   ├── templates/
│   │   │   │   └── application.properties
│   │   ├── test/java/com/example/servingwebcontent/
├── images
└── README.md

🏗️ Cấu trúc lớp và phân lớp

Reader: thông tin người đọc

Book: thông tin giáo trình

Loan: phiếu mượn/trả

Main: lớp chạy chính

🧪 Kiểm thử chức năng

Lớp	Chức năng kiểm thử chính
Reader	Đăng ký, xóa, chỉnh sửa, hiển thị thông tin
Book	Cập nhật giáo trình, xóa, hiển thị danh sách
Loan	Cập nhật hạn mượn/trả giáo trình, hiển thị phiếu mượn/trả
🛠️ Chức năng chính

Quản lý người đọc: Thêm / Sửa / Xóa

Quản lý giáo trình: Thêm / Sửa / Xóa, cập nhật số lượng

Quản lý mượn/trả: Cập nhật ngày mượn / trả

Lưu trữ dữ liệu: File nhị phân (ObjectOutputStream, ObjectInputStream)

📊 Class Diagram

📊 Activity Diagram – Mượn giáo trình

📝 Mô tả đối tượng

Book

Thuộc tính: title, author, numPages, status

Hành vi: checkAvailability(), markAsBorrowed(), markAsReturned(), display()

Reader

Thuộc tính: readerID, name, email, phone, borrowedBooks

Hành vi: borrowBook(Book), returnBook(Book), viewBorrowHistory()

Loan

Thuộc tính: loanID, book, reader, loanDate, returnDate, status

Hành vi: markReturned(Date), isOverdue(Date)

🖥️ Giao diện chương trình (Console)

🌟 Chức năng nổi bật

Xử lý nhập sai dữ liệu

Tìm kiếm nhanh theo mã số hoặc tên

Hiển thị dữ liệu rõ ràng trên console

💡 Công nghệ sử dụng

Ngôn ngữ lập trình: Java

Framework: Spring Boot (MVC)

Giao diện: Console

Lưu trữ: File nhị phân

Cấu trúc dữ liệu: ArrayList, LinkedList, Map

🚀 Hướng phát triển

Thêm giao diện đồ họa (GUI)

Kết nối cơ sở dữ liệu (JDBC / MySQL / SQLite)

Tích hợp RESTful API

⚙️ Cài đặt & Chạy

git clone https://github.com/phamkheng/OOP_N02_T3_2_2025_Group1.git
cd OOP_N02_T3_2_2025_Group1

# Mở project bằng IDE hoặc:
javac src/*.java
java Main

📚 Tài liệu tham khảo

Slide bài giảng môn Lập trình Hướng Đối Tượng – GVHD: TS. Nguyễn Lệ Thu

Java Docs – Oracle

Stack Overflow – Community
