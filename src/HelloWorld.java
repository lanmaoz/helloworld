/** 
 * projectName:testJava 
 * fileName:HelloWorld.java 
 * packageName: 
 * date:2020年3月30日上午9:55:20 
 * copyright(c) 2017-2020 xxx公司
 */

/**   
 * @title: HelloWorld.java 
 * @package  
 * @description: TODO
 * @author: fendo
 * @date: 2020年3月30日 上午9:55:20 
 * @version: V1.0   
*/
public class HelloWorld {

	/**
	 *@title main 
	 *@description: TODO
	 *@author: fendo
	 *@date: 2020年3月30日 上午9:55:20
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
                System.out.println("pp");; //随便什么，在这里加断点
            }
            sum+=moneyEachDay;
              
            System.out.println(i + " 天之后，洪帮主手中的钱总数是: " + sum );
        }
	}

}
