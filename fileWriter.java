    public static void writerFile()
    {
        try
        {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\CENEVAR\\Desktop\\IdeaProjects\\files\\students.txt",true));
            bufferedWriter.newLine();
            bufferedWriter.write("Hello!");
            System.out.println("wrote!");
            bufferedWriter.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
