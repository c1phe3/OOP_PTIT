/**
Viết chương trình Java để quản lý danh sách các công việc và tìm ra công việcưu tiên cao nhấttheo các tiêu chí sau:

Mỗi công việc có:

Tên công việc(String)

Độ ưu tiên(int) – số càng nhỏ, ưu tiên càng cao.

Thời gian hoàn thành dự kiến(int, đơn vị phút).

Yêu cầu tìm kiếm
Chọn công việc cóđộ ưu tiên nhỏ nhất.

Nếu nhiều công việc có cùng độ ưu tiên:

Chọn công việc cóthời gian hoàn thành ngắn nhất.

Nếu tiếp tục trùng:

Chọn công việc theothứ tự từ điển têntăng dần.

Sử dụngComparatorđể xác định công việc ưu tiên nhất.

Không sử dụng hoặc tạo file.
Chỉ xử lý input/output chuẩn.
Đảm bảo đúng định dạng output, không in thừa.

4
Backup 2 30
Update 1 15
Cleanup 1 20
Deploy 1 15


Deploy 1 15

 */

import java.util.*;

class Job{
    String name;
    int priority;
    int timedone;

    public Job(String name, int priority, int timedone){
        this.name = name;
        this.priority = priority;
        this.timedone = timedone;
    }

    int getPriority(){
        return this.priority;
    }

    int getTimeDone(){
        return this.timedone;
    }

    String getName(){
        return this.name;
    }


}



public class COMPARATOR021{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        List<Job> jobs = new ArrayList<>();
        int s = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < s; i++){
            String str = sc.nextLine();
            String []arr = str.split(" ");
            Job job = new Job(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
            jobs.add(job);
        }

        Comparator priority = Comparator.comparing(Job::getPriority);
        Comparator name = Comparator.comparing(Job::getName);
        Comparator time = Comparator.comparing(Job::getTimeDone);
        Comparator combine = priority.thenComparing(time).thenComparing(name);
        Collections.sort(jobs, combine);

        for (Job t : jobs){
            System.out.println(t.getName() + " " + t.getPriority() + " " + t.getTimeDone());
            break;
        }

    }
}