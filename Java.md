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





