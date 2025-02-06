class Hello{
	int a[]=new int[50];
	int b=0;
	public boolean find(long searchKey){
		int j;
		for(j=0;j<b;j++)
			if(a[j]==searchKey){
				System.out.println(a[j]+":is Found");
				break;
			}
			if(j==b)
				return false;
			else
				return true;
	}
			public void insert(int value)//put element into array
			{
				a[b]=value;
				b++;
			}
			public boolean delete(int value){
				int j;
				for(j=0;j<b;j++)
					if(value==a[j])
						break;
					if(j==b)
						return false;
					else{
						for(int k=j;k<b;k++)
						a[k]=a[k+1];
						b--;
						return true;
					}
			}
			public void display(){
				for(int j=0;j<b;j++){
					System.out.println(a[j]);
					System.out.println("--------");
				}
			}
}
class jtc47{
	public static void main(String[] args){
		Hello arr=null;
		arr=new Hello();
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		arr.display();//display items
		int SearchKey=88;//search for items
		if(arr.find(SearchKey)){
			System.out.println("found :"+SearchKey);
		}
		else{
			System.out.println("can't find :"+SearchKey);
			arr.delete(00);
			arr.delete(55);
			arr.delete(99);
			arr.display();
}}}