# 입출력 스트림 이란 ?

자바에서의 데이터는 스트림(Stream) 을 통해 입출력된다.
스트림은 데이터의 통로 역할을 하며, 프로그램이 출발지냐,  도착지냐에 따라 스트림의 종류가 결정된다.

__프로그램이 데이터를 입력 받을때에는__ input stream(입력스트림) 이라고 부르고

__프로그램이 데이터를 보낼때에는__ output stream(출력스트림) 이라고 한다.

### 스트림의 특성

1. 스트림은 한 방향이므로, 하나의 스트림에서 입력과 출력을 모두 할 수없다. ( 다른 프로그램과 데이터를 교환 할 때에는 양쪽 모두 입출력 스트림이 필요하다.
2. 스트림 클래스는 byte기반 스트림과 Character(문자) 기반 스트림으로 구분된다.

-byte기반 스트림 : 그림, 멀티미디어, 문자등 모든 종류의 데이터를 받고 보낼 수 있다.
-character 기반 스트림 : 오로지 문자만 받고 보낼수 있도록 특화 되어있다.
3. 자바의 기본적인 데이터 입출력(IO)API는 java.io 패키지에서 제공한다.


#### inputStream / outputStream 


inputStream과 outputStream은 byte기반 스트림의 최상위 클래스이다. 
inputStream의 주요 메서드로는 
- read()
- read(byte[] b)
- close()
등이 있으며 , 

그 중에서 read()는  입력스트림으로 부터 1byte를 읽고 읽은 바이트를 int로 리턴, 리턴된 4byte(int)중 끝의 1byte에만 데이터가 있는 방식이다.
예를들어 입력스트림에서 10개의 byte가 들어올때 while문 조건 안에 read() 메소드가 있다면 1byte씩 10번을 읽는다.
더이상 읽을 바이트가 없으면 read()메서드는 -1을 리턴한다

read(byte[] b)는 입력스트림으로부터 매개값으로 주어진 byte 배열의 길이만큼 byte를 읽고 배열에 저장한 후 읽은 byte 수를 리턴한다.
* 많은양의 바이트를 읽을때 1byte씩 읽는 read()메소드보다 매개값으로 주어진 배열 길이만큼 읽는 read(byte[] b) 메서드를 쓰는것이 루프를
 도는 횟수를 현저히 줄이는 방법이다. 
ex) 
InputStream is = newFileInputStream("C:/input.txt");
> int readByte;
> byte[] byteArray = new byte[100];
> while((readByte = is.read()) != -1{ . . . }

close()메소드는 사용한 자원을 반납하고 입력 스트림을 닫는 메서드이다. 

* close()를 사용하는 이유는. 입력,출력을 사용한뒤, 자원을 반납하고 닫지않으면. 조금씩이라도 남아있는 데이터들이 계속된
입,출력에 쌓이고 쌓여 결국엔 할당된 데이터양을 초과하여 서버가 터지는 일이 발생하기 때문이다 .


OutputStream은 바이트기반 출력 스트림의 최상위 추상 클래스
모든 바이트 기반 출력 스트림은 OutputStream 클래스를 상속 받아서 만들어진다. 주요 메소드로는 

write(int b) , write(byte[] b) , flush() , close()

write(int b)  : 출력스트림으로 1byte를 보냄( b의 끝 1byte)

-OutputStream os = new FileOutputStream("C:/output.txt");
byte [] date = "Programmer Strudy Blog".getBytes();
for(int i = 0; i < data.length i++){
	os.write(data[i]);  //철자를 하나씩 보냄.
}

write(byte[] b) : 출력스트림으로 주어진 바이트 배열 b의 모든 바이트를 보냄

-OutputStream os = new FileOutputStream("C:/output.txt");
byte [] data = "Progreammer Study Blog".getBytes();
os.write(data);  //모두 한번에 보냄

flush() : 버퍼에 잔류하는 모든 바이트를 출력(버퍼를 비우는 역할)

close(): 사용한 시스템 자원을 반납하고 출력 스트림을 닫음

자바의 InputStream과 OutputStream에 대해 알아보았다!



