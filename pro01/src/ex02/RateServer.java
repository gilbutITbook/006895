package ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class RateServer {
	private static float USD_RATE= 1124.70F;
	private static float JPY_RATE = 10.113F;
	private static float CNY_RATE = 163.30F;
	private static float GBP_RATE = 1444.35F;
	private static float EUR_RATE = 1295.97F;
	
	public static void main(String[] args){
		InputStream is;
		BufferedReader br;
		BufferedWriter bw;
		PrintWriter pw=null;
		OutputStream os;
		ServerSocket serverSocket;
		Socket s1=null;
		String ipAddrs=null;
		String inMessage=null;
		float outMessage=0f;
		try{
			serverSocket= new ServerSocket(5434);
			System.out.println("서버 실행 중...");
			
			while(true){
				//클라이언트의 접속을 인지 시에 accept()메소드를 호출해서 소켓 객체를 생성한다.
				s1= serverSocket.accept();
				is=s1.getInputStream();
				os = s1.getOutputStream();
				br=new BufferedReader(new InputStreamReader(is));
				String data=br.readLine();
				System.out.println("서버 수신 데이터:"+data);
				String result=calculate(data);
				System.out.println(result);
				
				
				bw = new BufferedWriter(new OutputStreamWriter(os));
				pw=new PrintWriter(bw,true);
				pw.println(result);
				pw.close();
			}
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
	
	private static  String calculate(String data){
		String []token=data.split(",");
		
		float won=Float.parseFloat(token[0]);
		String operator=token[1];
		String result=null;
		if(operator.equals("달러")){
			result=String.format("%.6f",won/USD_RATE);
		}else if(operator.equals("엔화")){
			result=String.format("%.6f",won/JPY_RATE);
		}else if(operator.equals("위안")){
			result=String.format("%.6f",won/CNY_RATE);
		}else if(operator.equals("파운드")) {
			result=String.format("%.6f",won/GBP_RATE);
		}else if(operator.equals("유로")) {
			result=String.format("%.6f",won/EUR_RATE);
		}
		
		return result;
		
	}	
}
