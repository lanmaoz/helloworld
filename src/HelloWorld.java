/** 
 * projectName:testJava 
 * fileName:HelloWorld.java 
 * packageName: 
 * date:2020��3��30������9:55:20 
 * copyright(c) 2017-2020 xxx��˾
 */

/**   
 * @title: HelloWorld.java 
 * @package  
 * @description: TODO
 * @author: fendo
 * @date: 2020��3��30�� ����9:55:20 
 * @version: V1.0   
*/
public class HelloWorld {

	/**
	 *@title main 
	 *@description: TODO
	 *@author: fendo
	 *@date: 2020��3��30�� ����9:55:20
	 *@param args
	 *@throws 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int moneyEachDay = 0;
        int day = 10;
        int sum=0;
        for (int i = 1; i <= day; i++) {
            if(0==moneyEachDay)
                moneyEachDay = 1;
            else
                moneyEachDay *= 2;
            if(i==5){
                System.out.println("pp");; //���ʲô��������Ӷϵ�
            }
            sum+=moneyEachDay;
              
            System.out.println(i + " ��֮�󣬺�������е�Ǯ������: " + sum );
        }
	}

}
