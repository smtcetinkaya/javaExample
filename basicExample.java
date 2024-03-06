    public static void sa(int k)
    {
        int     i;
        long     sum;
        int[] num = new int[32];

        i = 2;
        k = 540;
        sum = 0;
        while (i < k)
        {
            if (k % i == 0)
            {
                System.out.println(k + " is not a prime");
                return;
            }
            i++;
        }
        System.out.println(k+" is a prime");

        i = 1;
        num[0] = 0;
        while (i <= k)
        {
            if (k % i == 0)
            {
                System.out.println(i);
                num[i] = i;
                sum += i;
            }
            i++;
        }
        System.out.println(sum + " total");
    }

}
