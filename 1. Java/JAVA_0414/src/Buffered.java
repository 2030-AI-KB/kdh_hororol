import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Buffered {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s); // 절달된 매개변수 str을 기본(default) delim으로 분리합니다. 기본 delimiter는 공백 문자들인 " \t\n\r\t"입니다. 
		
		int a = Integer.parseInt(st.nextToken()); // readLine()을 통해 입력받은 값을 공백단위로 구분하여 순서대로 호출
		int b = Integer.parseInt(st.nextToken());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String rs = String.valueOf(a+b); // 출력은 문자열만 되기에 숫자를 문자열로 형변환한다.
		bw.write(rs);
		bw.flush();
		bw.close();
	}

}
