package UserModule;


/**
* UserModule/UserOperations.java .
* 由IDL-to-Java 编译器 (可移植), 版本 "3.2"生成
 * 从/home/kangyuhang/IntelliJIDEAProjects/ToDoListApp/src/creator.idl

*/

public interface UserOperations 
{
  boolean add(String startTime, String endTime, String label);
  String query(String startTime, String endTime);
  boolean delete(String key);
  boolean clear();
  String show();
} // interface UserOperations
