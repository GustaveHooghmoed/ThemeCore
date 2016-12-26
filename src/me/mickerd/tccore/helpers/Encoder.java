package me.mickerd.tccore.helpers;

class Encoder
{
public static void a(String string){
{
String str,Newstr=string;
try {
	str="@(/";
for (int i=0;i<str.length();i++)
{
char ch=Character.toLowerCase(str.charAt(i));
switch (ch)
{
case '{':
Newstr=Newstr+"A";
break;
case '}':
Newstr=Newstr+"B";
break;
case '#':
Newstr=Newstr+"C";
break;
case '~':
Newstr=Newstr+"D";
break;
case '+':
Newstr=Newstr+"E";
break;
case '-':
Newstr=Newstr+"F";
break;
case '*':
Newstr=Newstr+"G";
break;
case '@':
Newstr=Newstr+"H";
break;
case '/':
Newstr=Newstr+"I";
break;
case '\\':
Newstr=Newstr+"J";
break;
case '?':
Newstr=Newstr+"K";
break;
case '$':
Newstr=Newstr+"L";
break;
case '!':
Newstr=Newstr+"M";
break;
case '^':
Newstr=Newstr+"N";
break;
case '(':
Newstr=Newstr+"O";
break;
case ')':
Newstr=Newstr+"P";
break;
case '<':
Newstr=Newstr+"Q";
break;
case '>':
Newstr=Newstr+"R";
break;
case '=' :
Newstr=Newstr+"S";
break;
case ';':
Newstr=Newstr+"T";
break;
case ',':
Newstr=Newstr+"U";
break;
case '_' :
Newstr=Newstr+"V";
break;
case '[':
Newstr=Newstr+"W";
break;
case ']' :
Newstr=Newstr+"X";
break;
case ':':
Newstr=Newstr+"Y";
break;
case '\"' :
Newstr=Newstr+"Z";
break;
case '1':
Newstr=Newstr+"r";
break;
case '2':
Newstr=Newstr+"k";
break;
case '3':
Newstr=Newstr+"b";
break;
case '4':
Newstr = Newstr+"e";
break;
case '5':
Newstr = Newstr+"q";
break;
case '6':
Newstr = Newstr+"h";
break;
case '7':
Newstr = Newstr+"u";
break;
case '8' :
Newstr= Newstr+"y";
break;
case '9':
Newstr = Newstr+"w";
break;
case '0':
Newstr = Newstr+"z";
break;
case '.':
Newstr = Newstr+" ";
break;
default:
Newstr=Newstr+"0";
break;
}
}
}
catch(Exception ioe)
{
ioe.printStackTrace();
}
System.out.println("The decrypted string is: " +Newstr);
}
}
}