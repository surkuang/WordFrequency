
# WordFrequency
词频统计
目前已经实现了以下功能：

(1)	功能1：java wf -c <file> 
	输出文件中出现的字母的频率，按从大到小排列，出现次数同样多的，以字典序排列。

(2)	功能1：java wf -f <file>  
	输出文件中所有不重复的单词，按照出现次数由多到少排列，出现次数同样多的，以字典序排列
  
(3)	功能2：java wf -d <directory>  
	指定文件目录，对目录下每一个文件执行  wf.exe -f <file> 的操作。
  
(4)	功能3：java wf -d <directory> -n  
	指定文件目录，对目录下每一个文件执行  wf.exe -f <file> 的操作，取前n个单词，n=100
  
(5)	功能4：java wf -x <stopwordfile>  -f <file> 
	统计file中单词的频率，统计时出现在stopwordfile中的单词不参与统计
