# APIecommerse
Membuat API untuk sebuah aplikasi e-commerce sederhana, API ini bertujuan untuk mengakses serta memanipulasi data entitas dari database

## About
Program ini bertujuan untuk membuat backend API untuk aplikasi e-commerce sederhana yang nantinya memberikan response dengan format JSON. Adapun request method pada API memuat: <br/>
**GET** untuk mendapatkan list atau detail data dari entitas. <br/>
**POST** untuk membuat data entitas baru. <br/>
**PUT** untuk mengubah data dari entitas. <br/>
**DELETE** untuk menghapus data dari entitas. <br/>

Data-data yang digunakan dalam aplikasi e-Commerce ini akan disimpan pada **database SQLite** yang kemudian akan dilakukan suatu pengujian API yang telah diprogram melalui aplikasi **Postman**

## Spesifikasi API dalam Aplikasi e-Commerce 
### **GET**

- GET /users untuk mendapatkan daftar semua user yang termuat di dalam database. <br/>
'masukin code' 

![GetUsers](/image/GetAllUser.jpg"GetAllUser")

<br/>

- GET /users/{id} untuk mendapatkan informasi user dan alamatnya. <br/>
'masukin code' 

![GetUserId](/image/GetUserId.jpg"GetUserAdd")

<br/>

- GET /users/{id}/products untuk mendapatkan daftar produk milik user. <br/>
'masukin code' 

![GetUserProduct](/image/GetUserProduct.jpg"GetUserProduct")

<br/>

- GET /users/{id}/orders untuk mendapatkan daftar order milik user. <br/>
'masukin code' 

![GetUserOrders](/image/GetUserOrders.jpg"GetUserOrders")

<br/>

- GET /users/{id}/reviews untuk mendapatkan daftar review yang dibuat oleh user. <br/>
'masukin code' 

![GetUserReview](/image/GetUserReview.jpg"GetUserReview")

<br/>

- GET /orders/{id} untuk mendapatkan informasi order, buyer, detail order, review, product title, beserta pricenya. <br/>
'masukin code' 

![GetOrders](/image/GetOrders.jpg"GetOrders")

<br/>

- GET /products untuk mendapatkan daftar semua produk. <br/>
'masukin code' 

![GetProducts](/image/GetProducts.jpg"GetProducts")

<br/>

- GET /products/{id} untuk mendapatkan informasi produk dan seller. <br/>
'masukin code' 

![GetProductsSeller](/image/GetProductsId.jpg"GetProductsSeller")

<br/>

### **POST**
- Membuat entitas baru berupa tabel ... <br/>
Deskripsiin sendiri sesuai hasil

![PostTable](/image/PostUser.jpg"PostTableUser")

<br/>

- Membuat entitas baru berupa tabel ... <br/>
Deskripsiin sendiri sesuai hasil

![PostTable](/image/PostProduct.jpg"PostTableProduct")

<br/>

- Membuat entitas baru berupa tabel ... <br/>
Deskripsiin sendiri sesuai hasil

![PostTable](/image/PostOrder.jpg"PostTableOrder")

<br/>

### **PUT**
- Mengubah entitas yang ada dimana saya mengubah entitas pada ... <br/>
Deskripsiin sendiri sesuai proses

![PutTable](/image/Put.jpg"PutTable")

<br/>

### **DELETE**
- Menghapus data dari entitas tertentu dimana saya mencoba untuk menghapus data yang terdapat pada tabel ... <br/>
Deskripsiin sendiri sesuai proses

![Delete](/image/Put.jpg"Delete")

<br/>
