package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1011")
public class Somador1011 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
