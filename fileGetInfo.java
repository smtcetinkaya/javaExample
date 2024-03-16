    public static void getFileInfo()
    {
        File file = new File("C:\\Users\\CENEVAR\\Desktop\\IdeaProjects\\files\\students.txt");
        if(file.exists())
        {
            System.out.println("Name : " + file.getName());
            System.out.println("Path : " + file.getAbsolutePath());
            System.out.println("Can write : " + file.canWrite());
            System.out.println("Can write : " + file.canRead());
            System.out.println("Size : " + file.length());
        }
    }
