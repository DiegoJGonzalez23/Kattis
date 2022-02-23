//package s;
import java.util.*;
import java.io.*;
//Diego Gonzalez
public class Djkstras {
	public static int nodes;
	public static int edges;
	public static int queries;
	public static int startnode;
	public static boolean[] visited;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		nodes=1;edges=1;queries=1;startnode=1;
		StringTokenizer st =new StringTokenizer(br.readLine());
		nodes = Integer.parseInt(st.nextToken());
		edges = Integer.parseInt(st.nextToken());
		queries = Integer.parseInt(st.nextToken());
		startnode = Integer.parseInt(st.nextToken());
		while(nodes != 0 || edges != 0 || queries != 0 || startnode != 0){
			
			
			Queue<node> pq = new PriorityQueue<>();
			ArrayList<ArrayList<node>> graph = new ArrayList<>();
			int[] distancefromstart =new int[nodes];
			for(int i = 0; i < nodes; i++){
				graph.add(new ArrayList<node>());
				distancefromstart[i]=Integer.MAX_VALUE;
			}
			visited = new boolean[nodes];
		
			for(int i = 0; i < edges; i++){
				st =new StringTokenizer(br.readLine());
				int node1 = Integer.parseInt(st.nextToken());
				int node2 = Integer.parseInt(st.nextToken());
				int weight = Integer.parseInt(st.nextToken());
				graph.get(node1).add( new node(node2, weight));
				
			}
			distancefromstart[startnode] = 0;
			pq.add(new node(startnode, 0));
			while(!pq.isEmpty()){
				int current = pq.poll().destination;
				if(!visited[current]){
					visited[current] = true;
					for(node next: graph.get(current)){
						int nextdest = next.destination;
						int nextweight = next.weight;
						if(distancefromstart[current]+nextweight<distancefromstart[nextdest]){
							distancefromstart[nextdest] = distancefromstart[current]+nextweight;
							pq.add(new node(nextdest, distancefromstart[nextdest]));
						}

					}

				}

			}
			for(int i = 0; i < queries; i++){
				st =new StringTokenizer(br.readLine());
				int query = Integer.parseInt(st.nextToken());
				if(distancefromstart[query]!=Integer.MAX_VALUE){
				System.out.println(distancefromstart[query]);
			}
				else{
					System.out.println("Impossible");
				}
				}
				
			
			System.out.println();
			st = new StringTokenizer(br.readLine());
			nodes = Integer.parseInt(st.nextToken());
			edges = Integer.parseInt(st.nextToken());
			queries = Integer.parseInt(st.nextToken());
			startnode = Integer.parseInt(st.nextToken());
			
			
			
		}
		
		

	}
	
	
	static class node implements Comparable<node>{
		int destination;
		int weight;
		public node(int d, int w){
			destination = d;
			weight = w;
		}
		@Override
		public int compareTo(node o) {
			return  (this.weight-o.weight);
			
		}
		
		
		
		
		
	}

}
