type UserType = {
  email: string
  username: string | null
  age: number
}
type AddressType = {
  zipcode: string
  address: string
}
type UserWithAddressType = UserType & AddressType
const user02: UserWithAddressType = {
  email: 'user01@test.org',
  username: null,
  age: 40,
  zipcode: '1000',
  address: '주소',
}
function getUser(): UserType | void {}
function printUser(user?: UserType) {
  console.log(user!.username ?? '나나시')
}
printUser(user02)
102
