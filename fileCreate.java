    public  static void createFile()
    {
        File file = new File("C:\\Users\\CENEVAR\\Desktop\\IdeaProjects\\files\\students.txt");
        try
        {
            if(file.createNewFile())
                System.out.println("created");
            else
                System.out.println("exist!");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
