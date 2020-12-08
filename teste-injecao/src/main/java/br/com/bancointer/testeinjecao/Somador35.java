package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador35")
public class Somador35 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
