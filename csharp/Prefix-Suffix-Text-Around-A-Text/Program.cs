namespace ConsoleApplication
{
    class Program
    {
        static void Main(string[] args)
        {
            string inputPath = "C:\\test\\input.txt";
            string outputPath = "C:\\test\\output.txt";

            // Open the file to read from. 
            string readText = File.ReadAllText(inputPath);
            
            // split the string into array on newLine delimiter
            string[] readTextArr = readText.Split('\n');

            foreach (var str in readTextArr)
            {
                var tmp = "Hello " + str + Environment.NewLine;
                File.AppendAllText(outputPath, tmp);
            }
            
            Console.ReadKey();
        }
    }
}
