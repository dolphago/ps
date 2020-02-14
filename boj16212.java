import java.io.*;
import java.util.*;

public class boj16212 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			pq.add(Integer.parseInt(st.nextToken()));
		}
		StringBuilder sb=new StringBuilder();
		while(!pq.isEmpty()) sb.append(pq.poll()+" ");
		System.out.println(sb.toString());
	}
}