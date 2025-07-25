class Queue<T> {
  private items: T[] = []
  offer(item: T) {
    this.items.push(item)
  }
  poll(): T | undefined {
    return this.items.shift()
  }
}
const queue = new Queue<number>()
queue.offer(10)
queue.offer(20)
console.log(queue.poll())
