package org.example.DAO;

import java.sql.*;
import java.util.Scanner;

public class WriteToJDBCInDataBase  {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String url="jdbc:mysql://127.0.0.1:3306/march_aprilFive";
        String username="root";
        String password="root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,username,password);
            System.out.println("connection is successfully adding");
            Statement statement=connection.createStatement();
            //create query
//            String createQuery="create table Hospital_Bed_info (bed_id varchar(255), bed_type varchar(255), bed_charges_rate int(12))";
//            statement.execute(createQuery);
//            System.out.println("Hospital bed info created successfully");

//            String createQuery="create table Hospital ( hospital_id varchar(255)primary key , hospital_name varchar(255))";
//            boolean value=statement.execute(createQuery);
//            System.out.println("Hospital  created successfully "+value);

//
//            String createQuery="create table patient (patient_id varchar(255), patient_name varchar(255), patient_type varchar(255),no_of_days int(20),bedId varchar(255),bedType varchar(255),tota_bed_charges int(200))";
//            boolean valu1=statement.execute(createQuery);
//            System.out.println("patient bed info created successfully "+valu1);

            //add primary key
//            String alterAddPrimaryKey="alter table hospital_bed_info add primary key(bed_id)";
//            int updateColumn=statement.executeUpdate(alterAddPrimaryKey);
//            System.out.println(updateColumn);
//
//            //add new column
//            String alterAddColumn="ALTER TABLE hospital_bed_info ADD COLUMN hospital_id VARCHAR(255)";
//            int updateC=statement.executeUpdate(alterAddColumn);
//            System.out.println(updateC);

            //add foreign key
//            String alterAddForeignKey="alter table hospital_bed_info add foreign key(hospital_id) references hospital(hospital_id)";
//            int foreignKeyValue=statement.executeUpdate(alterAddForeignKey);
//            System.out.println("foreign key is successfully added "+foreignKeyValue);

//            System.out.println("please provide bed_id");
//            String bedId=scanner.next();
//
//            System.out.println("please provide bed type");
//            String bedType=scanner.next();
//
//            System.out.println("please provide bed charges rate");
//            int bedChargesRate=scanner.nextInt();
//
//            System.out.println("please provide hospital id");
//            String hospitalId=scanner.next();
//
//            String query="insert into hospital_bed_info values(?,?,?,?)";
//            PreparedStatement preparedStatement =connection.prepareStatement(query);
//            preparedStatement.setString(1,bedId);
//            preparedStatement.setString(2,bedType);
//            preparedStatement.setInt(3,bedChargesRate);
//            preparedStatement.setString(4,hospitalId);
//            int rowUpdate=preparedStatement.executeUpdate();
//            System.out.println("one row is successfully updated  : "+rowUpdate);

//            System.out.println("please provide hospital_id");
//            String hospitalId=scanner.next();
//
//            System.out.println("please provide hospital name");
//            String hospitalName=scanner.next();
//
//
//
//            String query1="insert into hospital values(?,?)";
//            PreparedStatement preparedStatement =connection.prepareStatement(query1);
//            preparedStatement.setString(1,hospitalId);
//            preparedStatement.setString(2,hospitalName);
//            int rowUpdate1=preparedStatement.executeUpdate();
//            System.out.println("one row is successfully updated  : "+rowUpdate1);

            System.out.println("please provide patient_id");
            String patientId=scanner.next();

            System.out.println("please provide patient name");
            String patientName=scanner.next();

            System.out.println("please provide patient type");
            String patientType=scanner.next();

            System.out.println("please provide days in number");
            int noOfDays=scanner.nextInt();

            System.out.println("please provide bed in id");
            String bedId=scanner.next();

            System.out.println("please provide bed type");
            String bedType=scanner.next();

            System.out.println("please provide total bed charges");
            int bedChargesAmount=scanner.nextInt();

            String query2="insert into patient values(?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement =connection.prepareStatement(query2);
            preparedStatement.setString(1,patientId);
            preparedStatement.setString(2,patientName);
            preparedStatement.setString(3,patientType);
            preparedStatement.setInt(4,noOfDays);
            preparedStatement.setString(5,bedId);
            preparedStatement.setString(6,bedType);
            preparedStatement.setInt(7,bedChargesAmount);
            int rowUpdate2=preparedStatement.executeUpdate();
            System.out.println("one row is successfully updated  : "+rowUpdate2);











        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
