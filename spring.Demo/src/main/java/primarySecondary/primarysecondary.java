package primarySecondary;


	import java.util.List;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;

	public class primarysecondary  {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			List<Primary>al=new ArrayList<>();
			List<Secondary>al1=new ArrayList<>();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","loki");
				PreparedStatement pr=con.prepareStatement("select * from primarydetails");
				PreparedStatement pr1=con.prepareStatement("select * from secondarydetails");
				ResultSet rs=pr.executeQuery();
				ResultSet rs1=pr1.executeQuery();
				while(rs.next()) {
					al.add(new Primary(rs.getLong("mobile"),rs.getString("name")));
				}
				while(rs1.next()) {
					al1.add(new Secondary(rs1.getLong("mobile"),rs1.getString("location")));
				}
				for(Primary x:al) {
					for(Secondary y:al1) {
						if(x.getMobile()==y.getMobile()) {
							System.out.println("Name: "+x.getName()+" Mobile Number: "+x.getMobile()+" Location: "+y.getLocation());
						}
					}
				}
				con.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	class Primary {
		private long mobile;
		private String name;
		Primary(long mobile,String name){
			this.mobile=mobile;
			this.name=name;
		}
	
		  @Override public String toString() { return "mobile=" + mobile + ", name=" +
		  name; }
		 
		public long getMobile() {
			return mobile;
		}
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

	}

	class Secondary {
		private long mobile;
		private String location;
		Secondary(long mobile,String location){
			this.mobile=mobile;
			this.location=location;
		}
		
		  @Override public String toString() { return "mobile=" + mobile +
		  ", location=" + location; }
		 
		public long getMobile() {
			return mobile;
		}
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		
	}

