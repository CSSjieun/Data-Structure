# Java
Compiler: javac ____.java

## 데이터 타입 Data Type
### 1. 데이터의 크기

8 bit (비트) = 1 byte <br>
1024 bit = 1 kilobyte <br>
1024 kilobyte = 1 megabyte <br>
1024 megabyte = 1 gigabyte <br>
1024 gigabyte = 1 terabyte <br>
1024 terabyte = 1 petabyte <br>
1024 petabyte = 1 exabyte <br>
1024 exabyte = 1 zettabyte <br>

컴퓨터는 0과 1로 이루어졌다는 말을 들어본 적이 있을 것이다. <br>
0과 1이 bit다.

### 2. 형변환 Type Conversion
<img width="783" alt="Screenshot 2024-04-27 at 20 42 04" src="https://github.com/CSSjieun/Data-Structure/assets/152406885/d4f7d45b-9f69-45cd-8264-86beebdd3258">

### 3. 연산자 Operator
대입 연산자 (x=1), 산술 Arithmetic 연산자 (+,-,...), 비교 연산자, 논리 연산자

이항 연산자 infix operator (좌항 + 우항)

단항 연산자: 예) +3: 양수 3, -3: 음수 3, 3++ (단항) = 3+1 (우항).

### 4. Boolean
참과 거짓을 의미하는 데이터 타입으로 bool이라고도 부른다. 

=: 좌항의 값을 우항의 변수에 대입할 때 사용하는 것 <br>
==: 같다.

.equals는 문자열을 비교할 때 사용하는 메소드이다.

a.equals(b);

String b = new String("Hello World");

### 5. 조건문 
1. if절
<img width="452" alt="Screenshot 2024-04-28 at 17 26 29" src="https://github.com/CSSjieun/Data-Structure/assets/152406885/cbf1fd0e-db63-4c23-9e0f-cf84e7faae13">

2. elseif와 else
<img width="389" alt="Screenshot 2024-04-28 at 17 32 18" src="https://github.com/CSSjieun/Data-Structure/assets/152406885/b515866e-c35e-4712-9edb-246254c3d505">

<img width="483" alt="Screenshot 2024-04-28 at 17 34 21" src="https://github.com/CSSjieun/Data-Structure/assets/152406885/2f57c649-95a8-49b1-b123-e766102046b8">

3. Switch문 <br>
switch 문을 사용할 때 한가지 주의 할 것은 switch의 조건으로는 몇가지 제한된 데이터 타입만을 사용할 수 있다. byte, short, char, int, enum, String, Character, Byte, Short, Integer

### 6. 논리 연산자 Conditional Operator
AND / OR

Boolean and (&&) Boolean (전체가 참일때 참, 좌항 우항 둘 중 하나라도 거짓이면 거짓) <br>
Boolean or  Boolean (||) 둘 중 하나라도 참이면 참, 둘 다 거짓이면 거짓)


!true == not <br>
!false == true

### 7. 반복문 Loop, Iteration
1. while문 <br>
```java
while(조건){
  반복 실행 영역
} // 조건이 참일 동안 반복 실행 영역을 실행한다.
```

2. for문 <br>
```java
for(초기화; 종료조건; 반복실행){
    반복적으로 실행될 구문
}
```

### 8. 배열 Array
배열은 연관된 정보를 그룹핑 하는데 사용한다. 연관된 데이터를 모아서 관리하기 위해서 사용하는 데이터 타입이다. <br>
변수가 하나의 데이터를 저장하기 위한 것이라면 배열은 여러 개의 데이터를 저장하기 위한 것이라고 할 수 있다. 

String[] classGroup에서 classGroup은 배열이 담길 변수의 이름이다. <br>
String[]은 classGroup에 담을 배열에 담길 데이터의 타입이 문자열의 배열이라는 의미다. <br>
배열을 선언할 때는 데이터 타입 뒤어 []를 붙여야 한다. <br>
[]이 없다면 classGroup은 배열이 아니라 문자열 데이터 타입을 갖는 변수가 된다. <br>

1. for-each 구문 <br>
for 구문을 좀 더 간편하게 사용하기 위해 만들어짐.

### 9. Method
main: 만들고 싶은 프로그램이 있다면 반드시 public static void main(String[] args)가 이끄는 중괄호 안에 실행되기를 기대하는 로직을 위치시켜야 한다.

자주 사용하는 로직을 메소드로 만들어두면 호출하는 것을 통해서 간편하게 로직을 재활용할 수 있다. 

메소드의 입력값은 매개변수(parameter)를 통해서 이루어진다. 

메소드 안에 고정적인 매개변수를 넣어놓고 가변적인 입력값을 통해서 결과값을 도출한다.

메소드의 출력값: return

### 10. 입력과 출력 I/O
예를 들어 사용자의 키보드, 마우스, 터치를 입력으로 받아들일 수 있고, 그에 따른 처리 결과를 모니터나 스피커등으로 출력 할 수 있다. <br>
입력 값이 없는 application은 input이 없는 method처럼 똑같은 결과를 반복하는 것에 불과하다. <br>
--> CLI (Command Line Interface)

GUI (Graphic User Interface) <br>

--> 절차 지향적 프로그래밍

앞으로는 객체 지향적 프로그래밍

### 11. 객체 지향 프로그래밍 Objectp-Oriented Programming 


























