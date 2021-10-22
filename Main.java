/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-May-21
 *   Time: 2:24 PM
 *   File: Main.java
 */

package May.may04_21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
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
        bfs(adj, 4, vertices);
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

    public static void bfs(ArrayList<ArrayList<Integer>> adj, int source, int vertices) {
        // vertices = adj.size()
        boolean[] visited = new boolean[vertices + 1];
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

