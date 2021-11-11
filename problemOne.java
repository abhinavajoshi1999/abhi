package interview;

public class problemOne {

	public static void main(String[] args) {
		//int N=0;
		int a=0,b=0,c=0,d=0;
		int i,j,k,l;
		int count=0;
		
		for(i=1;i<99;i++)
		{
			//a=i;
			for(j=i;j<99;j++)
			{
				//b=j;
				for(k=j;k<99;k++)
				{
					//c=k;
					for(l=k;l<99;l++)
					{
						//d=l;
						if(((((double)1/(double)i)+((double)1/(double)j)+((double)1/(double)k)+((double)1/(double)l))==1))
							
						{
							//count++;
							System.out.println(i+","+j+","+k+","+l);
							
						}
						//System.out.println("count"+count);
					}
				}
			}
			
		}
	}

}
 