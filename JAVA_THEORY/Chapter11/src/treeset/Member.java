package treeset;

import java.util.Comparator;

public class Member implements Comparator<Member>{
	
	private int memberId;
	private String memberName;
	
	public Member() {}
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	/**
	 * @return the memberId
	 */
	public int getMemberId() {
		return memberId;
	}
	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}
	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return memberName + "회원님의 아이디는" + memberId + "입니다.";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {
			Member member = (Member)obj;
			System.out.println("member.memberName :"+member.memberName);
			
			System.out.println("member.memberId : "+member.memberId);
			
			System.out.println("this.memberName :"+this.memberName);
			System.out.println("this.memberId :"+this.memberId);
			return (this.memberId == member.memberId);
			
		}
		System.out.println("retrun false");
		return false;
	}
//	@Override
//	public int compareTo(Member member) {
//		
//		return (this.memberName.compareTo(member.getMemberName()));
//	}
	@Override
	public int compare(Member member1, Member member2) {
		System.out.println("member1 : "+member1);
		System.out.println("member2 : "+member2);
		// TODO Auto-generated method stub
		return member2.memberId-member1.memberId;
	}

	
	
	
	

}
