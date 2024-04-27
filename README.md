# Data-Structure

## Data structure?
현실을 프로그래밍적으로 표현하는 것
![image](https://github.com/CSSjieun/Data-Structure/assets/152406885/1e452c79-7941-46e5-ba32-c113748b9e77)

ex) hierarchical strucrue, directory structure 

큰 데이터를 효과적으로 관리하는 것 (정리 정돈의 진화)
Document -> Book -> Bookshelf -> Library -> WWW / Internet/ Network

공부법
대전재: 몰라도 프로그램을 만들 수 있다 (프로그래밍 언어는 알아야 함)
경험을 더 쌓아야 함
포기 (멈춤) 와 유보 (잠시 멈췄다가 다시 공부하고 경험쌓고 돌아와서 다는 보는 것) 는 다르다.

## Array
거의 모든 언어에서 지원
데이터가 많아지면 그룹 관리의 필요성이 생겨나고 이럴 때 사용하는 것이 array이다.
여러 데이터를 하나의 이름으로 그룹핑해서 관리하기 위한 data structure. 

Value, Index, Element

## JAVA API

```java
int[] numbers1 = new int[4];

# int: element data type 
# []: it is array 
# [x]: x is the array size 
# numbers1: integer 

numbers1[0]=10;
numbers1[1]=20;
numbers1[2]=30;
```

<img width="811" alt="Screenshot 2024-04-27 at 13 23 24" src="https://github.com/CSSjieun/Data-Structure/assets/152406885/b0a3c24a-d9e1-42df-bf82-90d030fc2d38">

```java
int[] numbers2 = {10,20,30,40};

int[] numbers3 = new int[]{10,20,30,40};

String [] strings = new String[4]; 
```

# Character type

### GET 가져오기
```java
System.out.println(numbers1[0]);
``` 
<img width="818" alt="Screenshot 2024-04-27 at 13 27 15" src="https://github.com/CSSjieun/Data-Structure/assets/152406885/e8237ac1-e258-4f4d-86e0-20cf46436e67">

### Size 크기
```java
System.out.println(numbers1.length);
```
elements의 갯수를 셀 때는 1부터 counting하므로 result = 4

### Iteration 반복
```java
int i=0; 
while(numbers1.length > i){ 
  System.out.println(numbers1[i]); 
  i++; <br>
} 

for(i=0; numbers1.length > i; i++){ 
  System.out.println(numbers1[i]); 
}
```

i=0: 초기값 설정 <br>
numbers1.length > i: 이 값이 True 경우에만 반복문이 실행되는 조건 <br>
i++: 반복문이 실행된 후 결과

크기가 정해져 있다, 기능이 없다.

## List Data Structure
순서, 중복허용

### Data Add
<img width="835" alt="Screenshot 2024-04-27 at 13 41 27" src="https://github.com/CSSjieun/Data-Structure/assets/152406885/9951de72-5541-4462-a8c6-d5502a1248df">

### Data Delete
<img width="841" alt="Screenshot 2024-04-27 at 13 44 45" src="https://github.com/CSSjieun/Data-Structure/assets/152406885/7c0a91d2-b622-4234-841a-71092ceb0b08">

### List Operation
처음, 끝, 중간에 엘리먼트를 추가/삭제하는 기능 <br>
리스트에 데이터가 있는지를 체크하는 기능 <br>
리스트의 모든 데이터에 접근할 수 있는 기능 

### 언어별 비교
1. **C**: list (지원하지 x), 직접 만들거나, 남이 만든 Library를 사용해야 함 <br>
2. **JavaScript**: array = list <br>
```javascript
 numbers = [10,20,30,40,50];

 numbers.splice(3,1);

 for(i=0 < numbers.length; i++){ 
   console.log(numbers[i]); 
 } 
```
 3. **Python**: list = array
```python
 numbers = [10,20,30,40,50];

 numbers.pop(3)

 for number in numbers:
   print(number);
```

결론: 최근의 언어는 리스트를 기본적으로 지원한다. <br>

4. **Java**: 배열과 리스트를 모두 지원하고 두 가지가 구분되어 있다.
```java
array: int[] numbers = {10,20,30,40,50};

list: 
ArrayList numbers = new ArrayList(); 
numbers.add(10); 
numbers.add(20); 
numbers.add(30); 
numbers.add(40); 
numbers.add(50); 
numbers.remove(3);
```

LinkedList numbers = new LinkedList();

ArrayList numbers = new ArrayList();

--> 자바는 두 가지 형태의 리스트를 지원한다: LikedList, ArrayList (Tradeoff)

<img width="812" alt="Screenshot 2024-04-27 at 13 58 26" src="https://github.com/CSSjieun/Data-Structure/assets/152406885/e630e796-ee8a-4905-947e-3ced2a97d3e3">




Array List 개념 (7)


    
 








