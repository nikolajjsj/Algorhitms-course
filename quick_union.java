// lazy approach
// data structure: int array id[] of size N
// data interpretation: id[i] is parent of i
// root of i is: id[id[id[...id[i]...]]]

// id[] = [0, 1, 9, 4, 9, 6, 6, 7, 8, 9]
// root of 3 is 9, root of 5 is 6, 3 and 5 are not connected

public class QuickUnionUF
{
    private int[i] id;

    public QuickUnionUF(int N)
    {
        // set id of each object to itself (N array acceses)
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
    }

    private int root[int i]
    {
        // chase parent pointers until reach root
        // depth of i array acceses
        while (i != id[i]) i = id[i];
        return i;
    }

    public boolean connected(int p, int q)
    {
        // check if p and q have same root
        // depth of p and q array acceses
        return root(p) == root(q);
    }

    public void union(int p, int q)
    {
        // change root of p to point to root of q
        // depth of p and q array acceses
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}

