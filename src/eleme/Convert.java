package eleme;

public class Convert {
	public static double stringToDouble(String str) throws Exception{
		boolean negative = false;
		double sum = 0.0d;
		boolean pointAppear = false;
		int count = 1;//������¼С�����λ
		
		if(str == null || str.equals("")){
			throw new Exception("���������ַ���");
		}
		
		for(int i=0;i<str.length();i++){
			//�жϵ�һ���ַ��ǲ��Ǹ���
			if(i == 0 && (str.charAt(0)=='-'||str.charAt(0)=='+')){
				if(str.charAt(i) == '-')
					negative = true;
			}else{
				//�ж��Ƿ�ΪС����
				if(pointAppear == false && i !=0 && str.charAt(i) == '.'){
					pointAppear = true;
				}else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
					
					if(i==0 && str.charAt(i) == '0' ){
						if(str.charAt(i+1) != '.')
							throw new Exception("���Ϸ��ַ���1");
					}
					
					if(i==1 && str.charAt(i) == '0' && (str.charAt(0)=='-'||str.charAt(0)=='+')){
						if(str.charAt(i+1) != '.')
							throw new Exception("���Ϸ��ַ���2");
					}
					
					//��������
					if(pointAppear == false){
						sum = sum*10 +(str.charAt(i)-'0');
						if(sum > Double.MAX_VALUE) {
							throw new Exception("Խ��");
						}
					}else{
						sum = sum + Math.pow(0.1,count)*(str.charAt(i)-'0');
						count++;
					}
				}else{
					throw new Exception("���Ϸ��ַ���3");
				}
			}
		}
		return negative == true ? sum*(-1):sum;
		
	}

	public static void main(String[] args) {
		
		String s = "12.3.9";
		//double d = Double.valueOf(s);
		try {
			System.out.println(stringToDouble(s));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
