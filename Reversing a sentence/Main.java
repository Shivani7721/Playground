

#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size
int main()
{
    char str[100], reverse[100];
    int len, i, index, wordStart, wordEnd;
    gets(str);
    len   = strlen(str);
    index = 0;
   // Start checking of words from the end of string
    wordStart = len - 1;
    wordEnd   = len - 1;
    while(wordStart > 0)
    {
        // If a word is found
        if(str[wordStart] == ' ')
        {
            // Add the word to the reverse string
            i = wordStart + 1;
            while(i <= wordEnd)
            {
                reverse[index] = str[i];

                i++;
                index++;
            }
            reverse[index++] = ' ';
            wordEnd = wordStart - 1;
        }
      wordStart--;
    }
    // Finally add the last word
    for(i=0; i<=wordEnd; i++)
    {
        reverse[index] = str[i];
        index++;
    }
    // Add NULL character at the end of reverse string
    reverse[index] = '\0'; 
    printf("%s", reverse);
    return 0;
}