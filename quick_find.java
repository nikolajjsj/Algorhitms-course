// quick find is an eager approach
// data structure array id[] of size N
// interpretation: p and q are connected IFF they have the same id

// id[] = [0, 1, 1, 8, 8, 0, 0, 1, 8, 8]
// which means 0, 5, 6
// and 1, 2, 7
// and 3, 4, 8, 9 are connceted

public class QuickFindUF
{
    private int[] id;

    public QuickFindUF(int N)
    {
        // set id of each object to itself (N array accesses)
        id = new int[N];
        for (int i = 0; i < N; i++)
            if[i] = i;
    }

    public boolean connected(int p, int q)
    // check whether p and q are in the same component 
    // (2 array acceses)
    {
        return id[p] == id[q];
    }

    public void union(int p, int q)
    {
        int pid = id[p];
        int qid = id[q];
        // change all entries with id[p] to id[q]
        // at most 2N + 2 array acceses
        for (int i = 0; i < id.length; i++)
            if (id[i] == pid) id[i] = qid;
    }
}