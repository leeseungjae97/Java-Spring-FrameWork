package com.mycompany.service;

import com.mycompany.command.MemberCommand;
import com.mycompany.exception.MemberException;


public interface MemberInsert {
	void execute(MemberCommand member)throws MemberException;
}
