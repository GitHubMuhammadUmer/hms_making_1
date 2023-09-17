package hms_making;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class DB_Connection {

    static Connection getcon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Connection con;
    Statement st;
    ResultSet rs;

    DB_Connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms_info", "root", "");
            st = con.createStatement();
            System.out.println("DB is Connected");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public ResultSet Searchlab(String search){
    String sql="Select * from labadd where father_name='"+search+"' OR phone_no='"+search+"'";
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet LoginMatching (String user, String password){
         
        String sql="select * from hms_user where hms_user='"+user+"' and hms_password='"+password+"'";
        try{
            rs=st.executeQuery(sql);
        }catch(Exception e){
            System.out.println(e);
            
        }

   
        return rs;
    }
    public ResultSet LogindoctorMatching (String user, String password){
         
        String sql="select * from logindoctor where name='"+user+"' and password='"+password+"'";
        try{
            rs=st.executeQuery(sql);
        }catch(Exception e){
            System.out.println(e);
            
        }

   
        return rs;
    }
        public ResultSet LoginlabMatching (String name, String password){
         
        String sql="select * from loginlab where name='"+name+"' and password='"+password+"'";
        
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
       

   
        return rs;
    }
         public void updatedoctor(String id){
     String sql="update doctor set D_NAME=?,D_CONTACT=?,D_GENDER=? WHERE D_ID=?";
        try {
           st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
   
      


    /*public ResultSet getRoom(){
String sql= "Select * from room";
        try {
            
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
return rs;
}
    public ResultSet hh(){
   try{

     DB_Connection db= new DB_Connection();
     PreparedStatement st =con.prepareStatement
     
  String sql =   "insert into room values(?,?,?)";
     
     
}}*/
 
    
    
  /*    public ResultSet gethome(){
    
    String sql="Select * from home";
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    return rs;
    */}
public ResultSet getPatients(){
String sql= "Select * from patient";
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
return rs;
}
public ResultSet getadmint(){
String sql= "Select * from admint";
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
return rs;
}
public ResultSet SerachAppointment(String search){
            String sql="select * from appointment WHERE doctor_name='"+search+"'";
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            return rs;
        }
public ResultSet SerachDoctor(String search){
            String sql="SELECT * FROM doctor WHERE D_ID='"+search+"'";
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            return rs;
        }
  public void addDoctor(String ID,String name, String contact, String gender,String Qualification,String Specialization,String Fee){
        String sql="insert into doctor value('"+ID+"','"+name+"','"+contact+"','"+gender+"','"+Qualification+"','"+Specialization+"','"+Fee+"')";
        try {
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        public void addlab(String  patient_name, String father_name, String phone_no ,String age,String charges,String test,String expected_date){
        String sql="insert into labadd value('"+patient_name+"','"+father_name+"','"+phone_no+"','"+age+"','"+charges+"','"+test+"','"+expected_date+"')";
        try {
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
 public ResultSet getlab(){
String sql= "Select * from labadd";
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
return rs;
}
  public int reset(String P_Name,String P_Contact,String p_adderrs,String p_diagnosis, String p_blood,String P_id){
    int s=0;
    String sql="update  set P_Name='"+P_Name+"',P_Contact='"+P_Contact+"',p_adderrs='"+p_adderrs+"',p_diagnosis='"+p_diagnosis+"',p_blood='"+p_blood+"' where P_id="+P_id;
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
}
        public void addPatients(String ID,String name, String contact, String gender,String addrees,String diagnosis,String blood){
        String sql="insert into patient value('"+ID+"','"+name+"','"+contact+"','"+gender+"','"+addrees+"','"+diagnosis+"','"+blood+"')";
        try {
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
 public void addadmint(String Patient_Id,String P_Name, String P_Contact, String P_Gender,String p_addrees,String p_diagnosis,String blood,String room, String reason){
        String sql="insert into admint value('"+Patient_Id+"','"+P_Name+"','"+P_Contact+"','"+P_Gender+"','"+p_addrees+"','"+p_diagnosis+"','"+blood+"','"+room+"','"+reason+"')";
        try {
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
public void addprescription(String id, String name,String med, String quantity, String dosge , String type,String gender){
String sql="insert into prescription value('"+id+"','"+name+"','"+med+"','"+quantity+"','"+dosge+"','"+type+"','"+gender+"')";
        try {
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          
}
public void addAppointment( String p_id,String patient_name, String doctor_name, String fees ,String contact ,String room_number){
String sql="insert into appointment value('"+p_id+"','"+patient_name+"','"+doctor_name+"','"+fees+"','"+contact+"','"+room_number+"')";
        try {
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public ResultSet getappointment(){
String sql= "Select * from appointment";
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
return rs;
}
public ResultSet getprescription(){
String sql= "Select * from prescription";
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
return rs;
}
public void addAdmin(String ID,String user,String password,String gender, String contact ){
        String sql="insert into value('"+ID+"','"+user+"','"+password+"','"+gender+"',"+contact+"')";
        try {
            st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }/*
public ResultSet update(){
String sql= "UPDATE `patient` SET P_Id=?P_Name=?,`P_Contact=?,P_Gender=?,p_address=? WHERE ";
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
return rs;
}*/}
public ResultSet getDoctor(){
String sql= "Select * from doctor";
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
return rs;
}
public ResultSet SearchRecordsDoctor(String search){
//String sql="Select * from patient where P_Id='"+search+"' OR P_Name='"+search+"' OR P_Contact='"+search+"';
   
try {
    String sql="Select * from doctor where D_ID like'"+search+"%' OR D_NAME like '"+search+"%' OR D_CONTACT like '"+search+"%'"; 

            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
}
public ResultSet SearchRecordPatient(String search){
String sql="Select * from patient where P_Id='"+search+"'";
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }

return rs;
}
public ResultSet getDetailsPatientByid(String ID){
String sql="select * from patient where P_ID="+ID;
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
return rs;
}
public ResultSet getDetailslabByid(String patient_name){
String sql="select * from patient where patient _name="+patient_name;
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
return rs;
}
public ResultSet getDetailsDoctorByid(String ID){
String sql="select * from doctor where D_ID="+ID;
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
return rs;
}
    public int updatepatient(String P_Name,String P_Contact,String p_adderrs,String p_diagnosis, String p_blood,String P_id){
    int s=0;
    String sql="update patient set P_Name='"+P_Name+"',P_Contact='"+P_Contact+"',p_adderrs='"+p_adderrs+"',p_diagnosis='"+p_diagnosis+"',p_blood='"+p_blood+"' where P_id="+P_id;
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
}
     public int updatedoc(String D_NAME,String D_CONTACT, String Qualification,String Specialization,String Fee,String D_ID){
    int s=0;
    String sql="update doctor set D_NAME='"+D_NAME+"',D_CONTACT='"+D_CONTACT+"',Qualification='"+Qualification+"',Specialization='"+Specialization+"' where D_ID="+D_ID;
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
}
    public int restpassword(String hms_user_id,String hms_password){
    int s=0;
    String sql="update hms_user set hms_password='"+hms_password+"' where hms_user_id="+hms_user_id;
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
}
    public int restpassworddoctor(String id,String password){
    int s=0;
    String sql="update logindoctor set password='"+password+"' where id="+id;
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
}
    
    public int restpasswordlab(String id,String password){
    int s=0;
    String sql="update loginlab set password='"+password+"' where id="+id;
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
}
public int updateafees(String patient_name,String doctor_name,String fees,String contact, String room_number,String p_id){
    int s=0;
    String sql="update appointment set patient_name='"+patient_name+"',doctor_name='"+doctor_name+"',fees='"+fees+"',contact='"+contact+"',room_number='"+room_number+"' where P_id="+p_id;
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
}
public ResultSet getDetailsFeesByid(String id){
String sql="select * from appointment where p_id="+id;
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
return rs;
}
public ResultSet orderpatient(){
String sql="select * from patient order by P_id or P_Name ";
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
return rs;
}
public int updatefee(String patient_Name,String doctor_name,String fees,String contact, String room_number,String P_id){
    int s=0;
    String sql="update appointment set patient_Name='"+patient_Name+"',doctor_name='"+doctor_name+"',fees='"+fees+"',contact='"+contact+"',room_number='"+room_number+"' where P_id="+P_id;
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
}
public int updatedoctor(String D_NAME,String D_CONTACT,String Qualification, String Specialization,String Fee,String D_ID){
    int s=0;
    String sql="update doctor set D_NAME='"+D_NAME+"',D_CONTACT='"+D_CONTACT+"',Qualification='"+Qualification+"',Specialization='"+Specialization+"',Fee='"+Fee+"' where String D_ID="+D_ID;
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
}
    


      public int deleteDoctor(String D_ID){
int s=0;
    String sql="delete from doctor where D_ID='"+D_ID+"'";
        try {
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
}
public int deletPatient(String P_id){
int s=0;
    String sql="delete from patient where P_id='"+P_id+"'";
        try {
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }  return s;
}
public int deletappointview(String p_id){
int s=0;
    String sql="delete from appointment where p_id='"+p_id+"'";
        try {
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }  return s;
}
public int deletadmintrecord(String Patient_Id){
int s=0;
    String sql="delete from admint where Patient_Id='"+Patient_Id+"'";
        try {
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }  return s;
}
public int deletelab(String test){
int s=0;
    String sql="delete from labadd where test='"+test+"'";
        try {
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
}
public int delelabb(String father_name){
int s=0;
    String sql="delete from labadd where father_name='"+father_name+"'";
        try {
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }  return s;
}
public int deletefess(String D_ID){
int s=0;
    String sql="delete from doctor where D_ID='"+D_ID+"'";
        try {
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
}

public int deletePrescription(String id){
int s=0;
    String sql="delete from prescription where id='"+id+"'";
        try {
            s=st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
}
public int updateprescription(String name,String med,String quantity,String dosge, String type,String id){
    int s=0;
    String sql="update prescription set name='"+name+"',med='"+med+"',quantity='"+quantity+"',dosge='"+dosge+"',type='"+type+"' where id="+id;
        try {
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
}

public ResultSet getpresecriptionbyname(String id){
String sql="select * from prescription where id="+id;
        try {
            rs=st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
return rs;
}

    public static void main(String[] args) {
        DB_Connection db = new DB_Connection();
//  db.gethome();
    }
}
   

  


