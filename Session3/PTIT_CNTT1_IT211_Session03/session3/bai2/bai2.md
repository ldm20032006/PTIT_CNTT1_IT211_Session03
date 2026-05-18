1. Các thành phần của HTTP Request

Một HTTP Request thường gồm:

a. Method
b. URL (Request URL)
c. Headers
Ý nghĩa:

Host
Xác định domain hoặc server nhận request.
Content-Type
Cho biết kiểu dữ liệu được gửi lên.
application/json nghĩa là dữ liệu ở dạng JSON.
Authorization
Chứa thông tin xác thực người dùng/token đăng nhập.

Ngoài ra còn nhiều header khác như:

Accept
User-Agent
Cookie
Content-Length
d. Body
Chứa dữ liệu gửi từ client lên server.
Thường dùng trong POST, PUT.
2. Các thành phần của HTTP Response

Một HTTP Response gồm:

a. Status Line

Ví dụ:

HTTP/1.1 201 Created

Gồm:

Phiên bản HTTP
Mã trạng thái
Thông báo trạng thái
b. Headers

Ví dụ:

Content-Type: application/json
Content-Length: 120

Ý nghĩa:

Content-Type: kiểu dữ liệu trả về
Content-Length: kích thước dữ liệu
c. Body

Ví dụ:

{
"id": 1,
"ten": "Laptop"
}
Chứa dữ liệu server trả về cho client.
Mã trạng thái 201 Created thuộc nhóm nào?

201 Created thuộc nhóm:

2xx – Success

Ý nghĩa:

Request đã được xử lý thành công.
Server đã tạo mới tài nguyên thành công.
3. Nếu GET /api/sanpham/999 nhưng sản phẩm không tồn tại

Server thường trả về:

404 Not Found
4. Khi server gặp lỗi xử lý không xác định

Mã trạng thái thường dùng:

500 Internal Server Error

Thuộc nhóm:

5xx – Server Error

Ý nghĩa:

Lỗi xảy ra phía server.
Server không thể xử lý request do lỗi nội bộ không xác định.