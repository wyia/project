//二叉树
public class BiTree {
    public class TreeNode<E> {
        // 属性
        private E data; // 结点元素值
        private TreeNode<E> lchild; // 左孩子结点
        private TreeNode<E> rchild; // 右孩子结点
        // get和set方法

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public TreeNode<E> getLchild() {
            return lchild;
        }

        public void setLchild(TreeNode<E> lchild) {
            this.lchild = lchild;
        }

        public TreeNode<E> getRchild() {
            return rchild;
        }

        public void setRchild(TreeNode<E> rchild) {
            this.rchild = rchild;
        }

        // 构造方法,三个参数
        public TreeNode(E data, TreeNode<E> lchild, TreeNode<E> rchild) {
            this.data = data;
            this.lchild = lchild;
            this.rchild = rchild;
        }

        // 构造方法,三个参数
        public TreeNode(E data) {
            this.data = data;
            this.lchild = this.rchild = null;
        }

        // 构造方法,无参数
        public TreeNode() {
            this(null);
        }
    }

}
}
