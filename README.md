# Solid code

SOLID code là một phương pháp thiết kế và viết code, nhằm đảm bảo rằng code của bạn sẽ dễ dàng bảo trì, mở rộng và tái
sử dụng. Nó giúp giảm thiểu các lỗi và bug, tăng tính ổn định của ứng dụng và giảm chi phí bảo trì.

# Tóm tắt

- Quy trình apply SOLID code có thể đơn giản hơn là chỉ viết code và refactor, nhưng nó có thể bao gồm cả việc thiết kế
  và đánh giá lại kiến trúc của hệ thống.
- SOLID code không phải là một quy tắc cứng nhắc, mà là một nguyên tắc định hướng để bạn có thể áp dụng vào từng trường
  hợp cụ thể của mình.
- Ngoài những nguyên tắc của SOLID code, còn có nhiều design patterns (mẫu thiết kế) khác cũng rất hữu ích để bạn có thể
  áp dụng trong việc thiết kế và phát triển phần mềm.
- Để áp dụng được SOLID code, bạn cần có kiến thức cơ bản về lập trình và thiết kế hướng đối tượng, cùng với sự tinh tế
  và kỹ năng phân tích, đánh giá, tối ưu hóa code.

quy trình apply đơn giản nhất

```text
write code -> refactor -> more code -> refactor
```

## Nôi dung

SOLID code gồm 5 phần chính

- Single responsibility principle
- Open closed principle
- Liskov Substitution Principle
- Interface Segregation Principle
- Dependency inversion principle

### Single responsibility principle

```text
Một class chỉ nên giữ 1 trách nhiệm duy nhất 
(Chỉ có thể sửa đổi class với 1 lý do duy nhất)
```

- đảm bảo các component (method, class, utils) nên chỉ tập trung vào 1 vấn đề logic
- để biết có violate rule này không hay check xem code có bị phình ra trong method không
- check xem nó hiện đang thực hiện bao nhiêu vai trò, gồm các bước gì

### Open closed principle

```text
Có thể thoải mái mở rộng 1 class, nhưng không được sửa đổi bên trong class đó
(open for extension but closed for modification).
```

- giải pháp có thể là viết overloading method hoặc cho class đó kế thừa rồi tiếp tục mở rộng trên đó

### Liskov Substitution Principle

```text
Trong một chương trình, các object của class con có thể thay thế class cha mà không làm thay đổi tính đúng đắn của chương trình
```

- dấu hiệu nhận biết đang violate rule này là empty method, type checking
- tập trung thiết kế các class cha và co 1 cách hợp lý

### Interface Segregation Principle

```text
Thay vì dùng 1 interface lớn, ta nên tách thành nhiều interface nhỏ, với nhiều mục đích cụ thể
```

- client ko nên phụ thuộc vào interfaces method mà nó không cần
  => thiết kế interfaces ngắn gọn và tập trung
- trong trường hợp ko thể tách interface
  -> thử dùng adapter design pattern

### Dependency inversion principle

```text
- Các module cấp cao không nên phụ thuộc vào các modules cấp thấp. 
  Cả 2 nên phụ thuộc vào abstraction.
- Interface (abstraction) không nên phụ thuộc vào chi tiết, mà ngược lại.
  (Các class giao tiếp với nhau thông qua interface, không phải thông qua implementation.)
```
nói dễ hiểu thì đơn giản là ám chỉ ta nên viết các module ko nên quá thuộc vào sau
ví dụ:

module A -> module B
module A -> module C
module A -> module D

khi A thay đổi thì có khả năng B, C, D đều bị ảnh hưởng theo

#### Dependency Inject

- DI kết hợp tốt với DIP thay vì t phải tạo 1 low-module ở trong class, add sẽ để cái instance đó trược truyền vào dưới
  dạng 1 constructor, như
- vậy code ở high-module sẽ không phụ thuộc vào cái low-module đó

#### Inversion of control

IOC: sẽ tiếp tục giải quyết thêm 1 số vấn đề nữa của DI khi các Denpence phụ thuộc vào nhau quá nhiều

- hiểu đơn giản IOC sẽ new các object cho mình và quản lý nó, t không cần phải chủ động quản lý nó



