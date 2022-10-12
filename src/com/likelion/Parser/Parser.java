package com.likelion.Parser;

import com.likelion.hospital.Hospital;

public interface Parser<T> {
    T parse(String str);
}
