package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador827")
public class Somador827 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
