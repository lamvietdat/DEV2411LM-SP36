package devmaster.lesson03.service;

import devmaster.lesson03.entity.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceStudent {
    List<Student> students = new ArrayList<Student>();
    public void StudentService(){
        students.addAll(Arrays.asList(new Student(1L,"Devmaster1","Non","Số 25 VNp","0123456789","lamvietdat@gmail.com"),
                new Student(2L,"Devmaster2","Non","Số 25 VNp","0123456789","lamvietdat@gmail.com"),
                new Student(1L,"Devmaster1","Non","Số 25 VNp","0123456789","lamvietdat@gmail.com")));
    }
    public List<Student> getStudents(){
        return students;
    }
    private Student getStudent(Long id) {
        return  students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
    }
    //thêm một sinh viên mới
    public Student addStudent(Student student){
        students.add(student);
        return student;
    }

    //cập nhật thông tin sinh viên
    public Student updateStudent(Long id,Student student){
        Student check=getStudent(id);
        if(check==null){
            return null;
        }
        students.forEach(item->{
            if(item.getId()==id){
                item.setName(student.getName());
                item.setAddress(student.getAddress());
                item.setEmail(student.getEmail());
                item.setPhone(student.getPhone());
                item.setAge(student.getAge());
                item.setGender(student.getGender());
            }
        });
        return student;
    }

    //xóa thông tin sinh viên
    public boolean deletedStudent(Long id){
        Student check=getStudent(id);
        return students.remove(check);
    }
}
