//Sample Usage

string value = "2/17/2009 10:57:42 AM...Executing file 26 of 81 files";
string[] parts = value.ParseExact("{0}...Executing file {1} of {2} files");
foreach (string part in parts)
    Console.WriteLine(part);
Console.ReadKey();

//Output

2/17/2009 10:57:42 AM
26
81
