package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador190")
public class Somador190 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
