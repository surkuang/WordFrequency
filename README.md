# WordFrequency
词频统计
目前已经实现了以下功能：

(1)	功能1：wf.exe -f <file>  
    输出文件中所有不重复的单词，按照出现次数由多到少排列，出现次数同样多的，以字典序排列
  
(2)	功能2：wf.exe -d <directory>  指定文件目录，对目录下每一个文件执行  wf.exe -f <file> 的操作。
  
(3)	功能3：wf.exe -d <directory> -n  指定文件目录，对目录下每一个文件执行  wf.exe -f <file> 的操作，取前n个单词，n=100
  
(4)	功能 4：支持新的命令行参数, 例如：   wf.exe -x <stopwordfile>  -f <file> ，stopwordfile使用stopwords_en.txt
