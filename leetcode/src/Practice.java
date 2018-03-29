/**
 * 知识储备：
 * 1. 基本的算法与数据结构
 * 2. 离散数学
 * 3. 数的基本运算
 * 4. 线性表
 * 5. 链表： 判断链表是否有环
 *       a) 遍历链表并用HashMap保存，时间复杂度O(n)，空间复杂度O(n)
 *       b) 一快一慢两个指针，p1移动一次p2移动两次，相遇则有环
 * 6. 树
 * 7. 图
 * 8. 排序： 以quicksort为基准
 * 9. Out-of-core: 排序，查找，join
 *      a) top-1000 in 100 billion -> Heap 小跟堆
 *      b) 有限内存大数据排序、Top-K、Middle-K -> 分治或空间搜索然后归并
 *      c) Internal Sort -> Quicksort Tournament Sort
 *      d) find out the number appearing twice in 40 billion positive numbers
 *          use bitmap to minimize the space
 *      e) find out duplication url in 100 billion data
 *          hash + 分治
 *      d) middle-k in 100 billion -> 桶排序
 *      f) B-tree, b+ tree, b-link tree
 * 10. Dynamic programming
 *      a) exchanges
 *      b) Backpack
 * 11. 字符串匹配
 *      a) KMP Algorithm -> O(n) in time, O(M*A) in space
 *      b) Regular Expression
 *
 */
public class Practice {
    // main entry
    public static void main(String[] args){
        for (int i : Q1.solution(new int[]{2,7,11,15}, 9)){
            System.out.print(i+" ");
        }
    }
}
