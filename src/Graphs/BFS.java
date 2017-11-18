package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
  public static void main(String[] args) {
    int[][] matrix = {
            // 1 2 3 4 5 6 7 8 9 10
            { 0, 1, 1, 1, 0, 0, 0, 0, 0, 0 }, // 1
            { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 }, // 2
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 3
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 4
            { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 }, // 5
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 6
            { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0 }, // 7
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 8
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, // 9
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } // 10
    };
    boolean [] visited = new boolean[10];

    bfs(0, matrix, visited);
  }
  
  public static void bfs(int i, int[][] matrix, boolean[] visited) {
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(i);
    
    while(!queue.isEmpty())
    {
      int element=queue.remove();
      visited[element]=true;
      System.out.println(element);
      
      int j=0;
      while(j<matrix.length)
      {
        if(matrix[element][j]==1 && !visited[j])
        {
            queue.add(j);
        }
        j++;
      }
      
    }
  }
  
}