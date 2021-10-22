/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-May-21
 *   Time: 3:34 PM
 *   File: BfsForDisconnectedGraph.java
 */

package May.may04_21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BfsForDisconnectedGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        System.out.println("Enter the no of vertices");
        int vertices = sc.nextInt();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
        System.out.println("Enter the no of edges");
        int e = sc.nextInt();
        System.out.println("Enter the edges (u,v) ");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        printGraph(adj);
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (int x : adj.get(i)) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void bfsDis(ArrayList<ArrayList<Integer>> adj, int vertices) {
        boolean[] visited = new boolean[vertices + 1];
        for (int i = 0; i < vertices; i++) {
            if (visited[i] == false) {
                bfs(adj, i, vertices, visited);
            }
        }
    }

    public static void bfs(ArrayList<ArrayList<Integer>> adj, int source, int vertices, boolean[] visited) {
        // vertices = adj.size()

        Queue<Integer> q = new LinkedList<>();
        visited[source] = true;
        q.add(source);
        while (!q.isEmpty()) {
            int temp = q.remove();
            System.out.print(temp + " ");
            for (int v : adj.get(temp)) {
                if (visited[v] == false) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
        System.out.println();
    }
}


