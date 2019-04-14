char* longestPalindrome(char* s) {
    char *f,*e,*ft,*et;
    int len=strlen(s);
    char *r=NULL;
    int num=0;
    for(f=s;f-s<len;f++)
    {
        for(e=s+len-1;f<=e;e--)
        {
            ft=f;
            et=e;
            for(;(*ft==*et)&&(ft<=et);ft++,et--);
            if(ft>et)
            {
                if(e-f+1>num)
                {
                    r=f;
                    num=e-f+1;
                    break;
                }
            }
        }
        if(num>=s+len-1-f)
            break;
    }
	if(r==NULL&&len!=0)
	{
		r=s;
		num=1;
	}
	*(r+num)=0;
    return r;
}