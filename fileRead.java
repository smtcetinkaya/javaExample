    public static void readFile()
    {
        File file = new File("C:\\Users\\CENEVAR\\Desktop\\IdeaProjects\\files\\students.txt");
        try
        {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
