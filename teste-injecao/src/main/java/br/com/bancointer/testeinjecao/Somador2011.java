package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador2011")
public class Somador2011 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
