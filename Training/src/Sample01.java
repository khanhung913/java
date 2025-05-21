import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		Connection connection=null;
		try {
			connection=DBManager.getConnection();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("名前を入力");
			String name=sc.nextLine();
			System.out.println("性別を入力");
			int gender=sc.nextInt();
			System.out.println("生年月日を入力");
			sc.nextLine();
			String birthday=sc.nextLine();
			
			String sql="insert into employee (emp_id,emp_name,gender,birthday) values (((select max(emp_id) from employee) + 1),'"+name+"',"+gender+",'"+birthday+"')";
//			System.out.println(sql);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet rs=preparedStatement.executeQuery();
//			while(rs.next()) {
//				System.out.print(rs.getString("emp_id")+"\t");
//				System.out.print(rs.getString("emp_name")+"\t");
//				System.out.print(rs.getString("gender")+"\t");
//				System.out.println(rs.getString("birthday"));
//			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(connection);
		}
		
	}

}
